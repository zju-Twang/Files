package com.Spring.Business;

import com.Spring.DataBase;

public class TestBusiness {
	private SaveDataBusiness sdb = new SaveDataBusiness();

	// 调用业务逻辑，指定数据格式，启动存储数据方法
	public void saveDataTest() {
		sdb.setDataType(new DataBase());
		sdb.saveData();
	}

	// 注：在这种方式下，Business类是可以重用的，即无论保存什么类型数据，都可用Business类
}
