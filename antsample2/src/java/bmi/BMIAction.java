package bmi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BMIAction extends Action {

    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        BMIForm bmiForm = (BMIForm) form;

        double height = bmiForm.getHeightValue();
        double weight = bmiForm.getWeightValue();

        BMICalclator calc = new BMICalclator();
        int bmiValue = (int)calc.calclateBMI(height, weight);
        
        request.setAttribute("bmiValue", new Integer(
                bmiValue));

        return mapping.findForward("ok");
    }
}
