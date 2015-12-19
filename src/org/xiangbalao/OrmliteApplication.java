package org.xiangbalao;

import net.sqlcipher.database.SQLiteDatabase;

import org.xiangbalao.bean.DataTest;
import org.xiangbalao.bean.User;
import org.xiangbalao.common.db.DatabaseHelper;

import android.app.Application;
import android.os.Environment;

public class OrmliteApplication extends Application {
	private static String databasesPath = Environment
			.getExternalStorageDirectory().getAbsolutePath()
			+ "/xiangbalaoSqlcipher.db";

	@Override
	public void onCreate() {
		SQLiteDatabase.loadLibs(this);
		DatabaseHelper.initialize(databasesPath, 1, new Class<?>[] {
				DataTest.class, User.class });
		super.onCreate();

	}

}
