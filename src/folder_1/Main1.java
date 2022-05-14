package folder_1;

public class Main1 {

    public static void main(String[] args) throws CustomException {
    StringUtilsImpl utils = new StringUtilsImpl();

        System.out.println(utils.div("12","4"));
        System.out.println("\n");
        utils.findNumbers("7kfh88sdfhf2.4--bnk43f22");
        System.out.println("\n");
        utils.findWord("7kqwefhsdqwefhf2.qwe4--bnkfqwe","qwe");
        //utils.findWord("","");

    }
}
