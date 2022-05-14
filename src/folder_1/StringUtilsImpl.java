package folder_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null){
            throw new NullPointerException();//RETURN
        }//===========================
        double num1;
        try {
             num1 = Double.parseDouble(number1);
        }catch (NumberFormatException e){
          throw new NumberFormatException("number1 - не число!!!");
        }
        double num2;
        try {
             num2 = Double.parseDouble(number2);
        }catch (NumberFormatException e){
            throw new NumberFormatException("number2 - не число!!!");
        }//===============================
if (num2 == 0.0){
    throw new ArithmeticException("number2 = 0 - на ноль делить нельзя!!!");
}
        return num1/num2;

    }




    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        if (text == null || text == "" || word == null || word == ""){
            throw new NullPointerException("Пустое значение");//RETURN
        }//===========================

        StringBuffer stringTextBuf = new StringBuffer(text);

        //индекс первого появления
        int bufPerem = 0;
        //массив индексов
        int[] indexesMassiv = new int[text.length() - 1];
        //переменная для заполнения массива
        int il = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            bufPerem = stringTextBuf.indexOf(word, i);//находим
                indexesMassiv[il] = bufPerem;//добавляем
                il++;
            }

        int peremPerestan = 0;
        //длинна массива
        int lengthForIndexesMassiv = indexesMassiv.length;
        //подсчет разных элементов массива
        int peremKolRaznElem = 0;

        if (lengthForIndexesMassiv == 0 || lengthForIndexesMassiv == 1) {
            return null;
        }

        for (int i = 0; i < lengthForIndexesMassiv - 1; i++) {
            //первый равен следующему идем дальше, а иначе ставим элемент в начало
            if (indexesMassiv[i] != indexesMassiv[i + 1]) {
                indexesMassiv[peremPerestan++] = indexesMassiv[i];
                peremKolRaznElem++;
            }
        }
        //вывод массива
        for (int i = 0; i < peremKolRaznElem; i++) {
        System.out.println(indexesMassiv[i]);
        }

        return new int[0];
    }



    @Override
    public double[] findNumbers(String text) throws CustomException {

        String regularExpressionForDouble = "((\\d)+(\\.(\\d)+)?)";
        Matcher matcher = Pattern.compile(regularExpressionForDouble).matcher(text);

        int peremForException = 0;
        while (matcher.find()) {
             System.out.println(matcher.group());
             peremForException++;
        }
        if (peremForException == 0){
            throw new CustomException("В text - нет чисел");
        }
        return new double[0];
    }

}