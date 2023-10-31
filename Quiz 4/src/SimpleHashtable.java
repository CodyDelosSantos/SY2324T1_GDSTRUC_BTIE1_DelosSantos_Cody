public class SimpleHashtable {
    private StoredStudent[] hashtable;

    public SimpleHashtable(int capacity)
    {
        hashtable = new StoredStudent[capacity];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void put(String key, Student value)
    {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey))
        {
            //System.out.println("Sorry, there's already an element at position " + hashedKey);
            // Linear Probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        hashtable[hashedKey] = new StoredStudent(key, value);

    }

    public Student remove(String key)
    {
        int hashedKey = hashKey(key);

        hashtable[hashedKey] = null;

        return null;
    }
    public Student get(String key)
    {
        int hashedKey = findKey(key);

        if(hashedKey == -1)
        {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            if(hashtable[i] != null)
            {
                System.out.println("Element " + i + ": " + hashtable[i]);
            }
            else
            {
                System.out.println("Element " + i + ": null");
            }
        }
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        // found right key?
        if (isOccupied(hashedKey) && isSameKey(hashedKey, key))
        {
            return hashedKey;
        }
        else
        {
            // Linear Probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (hashedKey != stoppingIndex && !isSameKey(hashedKey, key))
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

            if (isOccupied(hashedKey) && isSameKey(hashedKey, key))
            {
                return hashedKey;
            }

            return -1;
        }
    }

    private boolean isSameKey(int hashedKey, String key)
    {
        if(hashtable[hashedKey] != null)
        {
            return hashtable[hashedKey].key.equals(key);
        }

        return false;
    }
}
