package bmi;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BMIForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	//プロパティー用フィールド
    private String height;
    private String weight;

    //バリデート/コンバート済値
    private double heightValue;
    private double weightValue;

    public ActionErrors validate(
            ActionMapping mapping,
            HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();
        try {
            heightValue = Double.parseDouble(height);
            if (heightValue <= 0) {
                errors.add("height", new ActionMessage(
                        "bmi.height.limit"));
            }
        } catch (NumberFormatException e) {
            errors.add("height", new ActionMessage(
                    "bmi.height.invalid"));
        }

        try {
            weightValue = Double.parseDouble(weight);
            if (weightValue <= 0) {
                errors.add("weight", new ActionMessage(
                        "bmi.weight.limit"));
            }
        } catch (NumberFormatException e) {
            errors.add("weight", new ActionMessage(
                    "bmi.weight.invalid"));
        }

        return errors;
    }

    public double getHeightValue() {
        return heightValue;
    }

    public double getWeightValue() {
        return weightValue;
    }

    //セッタ、ゲッタ
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
