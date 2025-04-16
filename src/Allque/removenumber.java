package Allque;

    public class removenumber {

        public static void main(String[] args) {
            String str = "Hello123World456";
            str= str.toLowerCase();
            String result[]= new String[10];
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                result[i] = str.replaceAll("[^0-9]", " ");

            }
            for(int i=0;i<4;i++)
            {
                if(result[i].equals(result[i+1]))
                {
                    count++;
                }

            }
            int m=result.length-count;
            }




        }
    
