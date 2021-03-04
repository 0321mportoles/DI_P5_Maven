package DI_P5.DI_P5;

import java.io.IOException;

import javafx.event.ActionEvent;

public class ForgotPasswordController {
	public void actionBack(ActionEvent ae) throws IOException {
		Main m = new Main();
		m.changeScene("LoginForm.fxml");
	}
	
	public void actionResetPassword(ActionEvent ae) throws IOException {
		Main m = new Main();
		m.changeScene("LoginForm.fxml");
	}
}
