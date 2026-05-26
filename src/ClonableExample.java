public class ClonableExample implements Cloneable{

        int id;
        String status="New";

    @Override
    public ClonableExample clone() {
        try {
            return (ClonableExample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        ClonableExample original=new ClonableExample();
        ClonableExample copy=original.clone();
        copy.status="Processing";
        System.out.println(original.status); // New
        System.out.println(copy.status);     // Processing
    }
}
