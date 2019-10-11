public int indexOf(String str)
{
    return indexOf(str, 0);
}

public int indexOf(String str, int fromIndex) 
{
    return indexOf(value, 0, value.length,
            str.value, 0, str.value.length, fromIndex);
}

static int indexOf(char[] source, int sourceOffset, int sourceCount,
String target, int fromIndex)
{
return indexOf(source, sourceOffset, sourceCount,target.value, 0, target.value.length,fromIndex);
}
static int indexOf(char[] source, int sourceOffset, int sourceCount,
char[] target, int targetOffset, int targetCount,
int fromIndex) 
{
    if (fromIndex >= sourceCount) 
    {
        return (targetCount == 0 ? sourceCount : -1);
    }
    if (fromIndex < 0) 
    {
        fromIndex = 0;
    }
    if (targetCount == 0) 
    {
        return fromIndex;
    }

    char first = target[targetOffset];
    int max = sourceOffset + (sourceCount - targetCount);

    for (int i = sourceOffset + fromIndex; i <= max; i++) 
    {
    /* Look for first character. */
        if (source[i] != first) 
        {
            while (++i <= max && source[i] != first);
        }

    /* Found first character, now look at the rest of v2 */
        if (i <= max) 
        {
            int j = i + 1;
            int end = j + targetCount - 1;
            for (int k = targetOffset + 1; j < end && source[j]== target[k]; j++, k++);

            if (j == end) 
            {
                /* Found whole string. */
                return i - sourceOffset;
            }
        }s
    }
    return -1;
}



// public boolean equals(Object anObject)
// {
//     if (this == anObject) 
//     {
//         return true;
//     }
//     if (anObject instanceof String) 
//     {
//         String anotherString = (String)anObject;
//         int n = value.length;
//         if (n == anotherString.value.length) 
//         {
//             char v1[] = value;
//             char v2[] = anotherString.value;
//             int i = 0;
//             while (n-- != 0) 
//             {
//                 if (v1[i] != v2[i])
//                     return false;
//                 i++;
//             }
//             return true;
//         }
//     }
//     return false;
// }