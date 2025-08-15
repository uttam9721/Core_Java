public class Methods {
    public static void main(String[] args) {
        String str = ("Engineering");
        System.out.println(str.contains("job"));
        System.out.println(str.contains("gin"));
        System.out.println(str.startsWith("engine"));
        System.out.println(str.startsWith("Eng"));
        System.out.println(str.endsWith("r ing"));
        System.out.println(str.endsWith("ing"));

        System.out.println("============================================");
        String str1="j2ee";
        System.out.println(str1.equals("adv java"));
        System.out.println(str1.equals("J2ee"));
        System.out.println(str1.equals("j2ee"));

        System.out.println("======================================");
        System.out.println(str1.equalsIgnoreCase("adv java"));
        System.out.println(str1.equalsIgnoreCase("J2ee"));
        System.out.println(str1.equalsIgnoreCase("j2ee"));
    } 
}
