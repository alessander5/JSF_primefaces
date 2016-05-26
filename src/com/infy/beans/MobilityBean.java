package com.infy.beans;

import com.infy.domein.Mobility;
import com.infy.service.IMobyService;
import com.infy.service.MobyServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Collection;

/**
 * Created by Infy on 26.05.2016.
 */

@ManagedBean(name = "mobyBean")
@SessionScoped
public class MobilityBean {

    private IMobyService mobyService = new MobyServiceImpl();

    Collection<Mobility> mobys;

    {
        mobys = mobyService.getList();
    }

    public Collection<Mobility> getMobys() {
        return mobys;
    }

    public void setMobys(Collection<Mobility> filesInfo) {
        this.mobys = mobys;
    }

}
