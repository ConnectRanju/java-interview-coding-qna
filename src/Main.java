//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                String s="Thiisastring";
                //System.out.print(s.length());
                char[]str=s.toCharArray();
                char[]reverse=new char[s.length()];
                //StringBuffer sb=new StringBuffer(s);
                int left=0;
                int right=s.length()-1;
                while(left<right){
                    reverse[left]=str[right];
                    left++;
                    right--;

                }
                System.out.println(reverse);

            }
        }


