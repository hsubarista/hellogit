/*
 * �쐬���F 2004/08/16
 *
 * TODO ���̐������ꂽ�t�@�C���̃e���v���[�g��ύX����ɂ͎����Q�ƁB
 * �E�B���h�E �� �ݒ� �� Java �� �R�[�h�E�X�^�C�� �� �R�[�h�E�e���v���[�g
 */
package bmi;

import junit.framework.TestCase;

/**
 * @author miya
 *
 * TODO ���̐������ꂽ�^�R�����g�̃e���v���[�g��ύX����ɂ͎����Q�ƁB
 * �E�B���h�E �� �ݒ� �� Java �� �R�[�h�E�X�^�C�� �� �R�[�h�E�e���v���[�g
 */
public class BMICalclatorTest extends TestCase{

    public void testCalclateBMI(){
        BMICalclator calc = new BMICalclator();
        assertEquals(29.3, calc.calclateBMI(175,90), 0.1);
    }
    
}
