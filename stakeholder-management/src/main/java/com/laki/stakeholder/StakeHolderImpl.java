package com.laki.stakeholder;


import com.laki.stakeholder.bean.StakeHolderBean;
import com.laki.stakeholder.bean.Supplier;
import com.laki.stakeholder.dao.StakeHolderDao;


public class StakeHolderImpl implements StakeHolder {


    public boolean persistSupplier(Supplier supplier) {
        return StakeHolderDao.getInstance().saveSupplier(supplier);
    }

    public boolean updateSupplier(Supplier supplier) {
        return StakeHolderDao.getInstance().updateSupplier(supplier);
    }

    public boolean deleteSupplier(String id) {
        return StakeHolderDao.getInstance().deleteSupplier(id);
    }

    public StakeHolderBean getSupplier(String id) {
        return StakeHolderDao.getSupplier(id);
    }
}
