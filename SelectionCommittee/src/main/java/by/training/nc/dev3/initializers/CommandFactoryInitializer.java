package by.training.nc.dev3.initializers;

import by.training.nc.dev3.commands.*;
import by.training.nc.dev3.commands.show_list.*;
import by.training.nc.dev3.iterfaces.factories.commands.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Valera Yalov4uk on 4/16/2017.
 */
public class CommandFactoryInitializer {

    public static Map<String, Command>  initialize() {
        Map<String, Command> map = new HashMap<>();
        map.put("login", new LoginCommand());
        map.put("register", new RegisterCommand());
        map.put("logout", new LogoutCommand());
        map.put("showFaculties", new ShowFacultiesCommand());
        map.put("showRoles", new ShowRolesCommand());
        map.put("showStatements", new ShowStatementsCommand());
        map.put("showSubjects", new ShowSubjectsCommand());
        map.put("showUsers", new ShowUsersCommand());
        map.put("registerToFaculty", new RegisterToFacultyCommand());
        map.put("registerToFacultyPost", new RegisterToFacultyPostCommand());
        map.put("showRegisteredUsers", new ShowRegisteredUsersCommand());
        map.put("registerStatement", new RegisterStatementCommand());
        map.put("calculateEntrants", new CalculateEntrantsCommand());
        return map;
    }
}
