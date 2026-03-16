class Config1 {

    static String appName;
    static int version;

    static {
        appName = "MyApp";
        version = 2;
        System.out.println("Статикалық блок орындалды");
    }

    public static void main(String[] args) {
        System.out.println(appName);
        System.out.println(version);
    }
}
