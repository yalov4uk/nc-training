package by.training.nc.dev3.commands.login_signup;

import by.training.nc.dev3.iterfaces.factories.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Valera Yalov4uk on 4/18/2017.
 */
public class LogoutCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "/jsps/login_signup/login.jsp";
        request.getSession().invalidate();
        return page;
    }
}
