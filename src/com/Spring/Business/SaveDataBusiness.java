package com.Spring.Business;

import com.Spring.SaveData;

///利用接口实现存储数据 业务逻辑(指定数据类型，完成数据存储方法调用，都在这里)
public class SaveDataBusiness {
	private SaveData db;// 未指定具体实现类

	/// 利用该方法在使用变量前指定数据格式,具体实现类是哪一个
	public void setDataType(SaveData db) {
		this.db = db;
	}

	/// 在指定db的具体实现类以后，调用其saveData接口实现
	public void saveData() {
		db.saveData();
	}
}
