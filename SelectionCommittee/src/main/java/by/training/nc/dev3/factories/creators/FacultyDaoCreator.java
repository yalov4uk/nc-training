package by.training.nc.dev3.factories.creators;

import by.training.nc.dev3.dao.FacultyDaoImpl;
import by.training.nc.dev3.exceptions.DaoUncheckedException;
import by.training.nc.dev3.iterfaces.dao.BaseDao;
import by.training.nc.dev3.iterfaces.factories.DaoCreator;
import com.jolbox.bonecp.BoneCP;

import java.sql.SQLException;

/**
 * Created by Valera Yalov4uk on 4/14/2017.
 */
public class FacultyDaoCreator implements DaoCreator {

    public BaseDao create(BoneCP pool){
        try {
            return new FacultyDaoImpl(pool.getConnection());
        }
        catch (SQLException e){
            throw new DaoUncheckedException("Faculty dao creator error");
        }
    }
}