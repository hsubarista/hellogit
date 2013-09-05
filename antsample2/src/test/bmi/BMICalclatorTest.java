/*
 * 作成日： 2004/08/16
 *
 * TODO この生成されたファイルのテンプレートを変更するには次を参照。
 * ウィンドウ ＞ 設定 ＞ Java ＞ コード・スタイル ＞ コード・テンプレート
 */
package bmi;

import junit.framework.TestCase;

/**
 * @author miya
 *
 * TODO この生成された型コメントのテンプレートを変更するには次を参照。
 * ウィンドウ ＞ 設定 ＞ Java ＞ コード・スタイル ＞ コード・テンプレート
 */
public class BMICalclatorTest extends TestCase{

    public void testCalclateBMI(){
        BMICalclator calc = new BMICalclator();
        assertEquals(29.3, calc.calclateBMI(175,90), 0.1);
    }
    
}
