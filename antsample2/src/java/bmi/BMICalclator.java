/*
 * 作成日： 2004/08/16
 *
 * TODO この生成されたファイルのテンプレートを変更するには次を参照。
 * ウィンドウ ＞ 設定 ＞ Java ＞ コード・スタイル ＞ コード・テンプレート
 */
package bmi;

/**
 * @author miya
 *
 * TODO この生成された型コメントのテンプレートを変更するには次を参照。
 * ウィンドウ ＞ 設定 ＞ Java ＞ コード・スタイル ＞ コード・テンプレート
 */
public class BMICalclator {

    public double calclateBMI(double height, double weight){
        height = height / 100;//cm→m
        return weight / height / height;
    }
 
    
    public static void main(String[] args) {
        System.out.println("hoge");
    }
    
}
