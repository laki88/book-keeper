package com.laki.stakeholder;

import com.laki.stakeholder.bean.StakeHolderBean;
import com.laki.stakeholder.bean.Supplier;

/**
 * Created by Lakshman on 6/3/16.
 */
public interface StakeHolder {


    boolean persistSupplier(Supplier supplier);

    boolean updateSupplier(Supplier supplier);

    boolean deleteSupplier(String id);

    StakeHolderBean getSupplier(String id);
}
