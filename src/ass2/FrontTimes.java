package ass2;

/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the
 * string is less than length 3. Return n copies of the front;
 *
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 *
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 *
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 *
 * @author: Siva Sankar
 */

public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        //  Your code goes here....
        String name="";
        String name1="";
        int len= str.length();
        if (len>=3)
        {
            name=str.substring(0,3);
        }
        else if (len==2)
        {
            name=str.substring(0,2);
        }
        else if (len==1)
        {
            name=str.substring(0,1);
        }
        for (int i=0;i<n ;i++ )
        {
            name1=name1+name;
        }
        return name1;

        //return "";
    }
}
