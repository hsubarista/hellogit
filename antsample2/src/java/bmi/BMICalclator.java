/*
 * �쐬���F 2004/08/16
 *
 * TODO ���̐������ꂽ�t�@�C���̃e���v���[�g��ύX����ɂ͎����Q�ƁB
 * �E�B���h�E �� �ݒ� �� Java �� �R�[�h�E�X�^�C�� �� �R�[�h�E�e���v���[�g
 */
package bmi;

/**
 * @author miya
 *
 * TODO ���̐������ꂽ�^�R�����g�̃e���v���[�g��ύX����ɂ͎����Q�ƁB
 * �E�B���h�E �� �ݒ� �� Java �� �R�[�h�E�X�^�C�� �� �R�[�h�E�e���v���[�g
 */
public class BMICalclator {

    public double calclateBMI(double height, double weight){
        height = height / 100;//cm��m
        return weight / height / height;
    }
 
    
    public static void main(String[] args) {
        System.out.println("hoge");
    }
    
}
