package by.training.nc.dev3.iterfaces.factories;

import by.training.nc.dev3.iterfaces.dao.BaseDao;

/**
 * Created by Valera Yalov4uk on 4/14/2017.
 */
public interface DaoFactory {
    BaseDao getDao(Class some);
}
