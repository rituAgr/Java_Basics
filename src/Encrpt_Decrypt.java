import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Ritu on 10/11/16.
 */
public class Encrpt_Decrypt {
    int KeySize;// This variable stores keySize;
    HashMap<Integer, String> s;//This hashMap Stores substitution for number of numbr of rounds of encryption
    Encrpt_Decrypt(int keysize)//Constructor
    {
        //Initialization and putting required values
        KeySize=keysize;
        s=new HashMap<Integer, String>();
        s.put(1,"que04");
        s.put(2,"334ns");
        s.put(3,"dak22");
        s.put(4,"ah1j8");
        s.put(5,"csd43");
        s.put(6,"cms01");
    }
    //Below are two helper function for rounds of encrpytion and decrption
    String getEncrptedRound(int round)
    {
        if(round<1||round>6)
            return null;
        return s.get(round);
    }
    int getDecrptedRound(String round)
    {
        for(Integer key:s.keySet())
        {
            if(s.get(key).equals(round))
                return key;
        }
        return -1;
    }
    //This is Encryption function
    String encryption(String txt)
    {
        int len=txt.length();
        StringBuilder encrypted_txt=new StringBuilder();// This stores encrypting string during encrption process
        String chunk;//This string stores input key String of keysize
        int start=0;//Start Position of input String key
        int rangeOfround=5;//Number of round can vary from 1 to 6
        int round=(int)(Math.random()*5+1);// This calculate random number of rounds from 1 to 6
        String text=new String(txt);
        String encryptedRound=getEncrptedRound(round);
        //Encryption process begins :
        while(round>=1) {
            if(start+KeySize>=len)
            {
                chunk= txt.substring(start,len);
                start=len;
            }
            else
            {
                chunk=text.substring(start,start+KeySize);
                start=start+KeySize;
            }
            while (chunk != null) {
                int add = 0;
                for (char c : chunk.toCharArray()) {
                    char e = (char) (c + add);
                    encrypted_txt.append(e);
                    add++;
                }
                if (start >= len)
                    break;
                int end = (start + KeySize) > len ? len : start + KeySize;
                chunk = text.substring(start, end);
                start = end;
            }
            round--;
            start=0;
            if(round==0) {
                encrypted_txt.append(encryptedRound);
                text = encrypted_txt.toString();
                //break;
            }
            encrypted_txt=new StringBuilder();
        }
        return text;//returning encrypted string
    }

    String decryption(String text)
    {
        int n=text.length();
        String round_txt=text.substring(n-5,n);// Taking out round of encryption from String
        int round=getDecrptedRound(round_txt);// Getting numeric value of number of rounds.
        System.out.println(round+"<- The no. of rounds "+  round_txt+"  n->"+n);
        String txt=text.substring(0,n-5);// Storing remaining encrypted text msg after rmoving number of roung txt msg
        int len=txt.length();
        StringBuilder str=new StringBuilder();
        String chunk;
        int start=0;
        while(round>=1) {
            if(start+KeySize>=len)
            {
                chunk= txt.substring(start,len);
                start=len;
            }
            else
            {
                chunk=text.substring(start,start+KeySize);
                start=start+KeySize;
            }
            while (chunk != null) {
                int add = 0;
                for (char c : chunk.toCharArray()) {
                    char e = (char) (c - add);
                    str.append(e);
                    add++;
                }
                if (start >= len)
                    break;
                int end = (start + KeySize) >len ? len : start + KeySize;
                chunk = txt.substring(start, end);
                start = end;
            }
            round--;
            start=0;
            txt=str.toString();
            str=new StringBuilder();
        }
        return txt;
        //System.out.println("The decrypted string is "+txt);
    }
    public static void main(String args[])//Starter Main Function
    {
        Scanner scan =new Scanner(System.in);
        Encrpt_Decrypt ob = new Encrpt_Decrypt(15);
            System.out.println("You want encrypt or decrypt \n1. Encrypt \n2. Decrypt\n Enter the numbers only");
            String option = scan.nextLine();
            if (option.equals("1")) {
                System.out.println("Enter the key text ");
                String txt = scan.nextLine();
                String text = ob.encryption(txt);
                System.out.println("The encrypted string is " + text);
            } else if (option.equals("2")) {
                System.out.println("Enter the key text ");
                String txt = scan.nextLine();
                System.out.println("The encrypted string is " + txt);
                String text = ob.decryption(txt);
                System.out.println("The decrypted string is " + text);
            } else
                System.out.println("The option entered is wrong ");
        scan.close();
        }
    }



