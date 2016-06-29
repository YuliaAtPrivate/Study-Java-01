package singletons;

import singletones.IvoryTower;

/**
 * Created by Yuta-At on 24/05/16.
 * Test for IvotyTown singleton.
 */
public class IvoryTowerTest extends SingletonAbstractTest<IvoryTower> {
    public IvoryTowerTest(){
        super(IvoryTower::getInstance);

    }


}
