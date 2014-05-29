package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンを探して変数を作る
		Button btnOK = (Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録
		btnOK.setOnClickListener(this);
	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

		//Randomクラスのインスタンスを作る
		Random rdm = new Random();
		//0から3までの4パターン
		int n = rdm.nextInt(4);


		//エディットテキストから入力内容を取り出す
		EditText ename = (EditText)findViewById(R.id.edtName);
		String inputMsg = ename.getText().toString();

		//Intentインスタンス変数を用意
		Intent intent = null;

		switch(n){
			case 0:
				//大吉のページへ飛ばす
				//インテントのインスタンス生成
				intent = new Intent(MainActivity.this , DaikichiActivity.class);
				//大吉のアクティビティ起動
				startActivity(intent);
				break;
			case 1:
				//中吉のページへ飛ばす
				intent = new Intent(MainActivity.this , ChukichiActivity.class);
				startActivity(intent);
				break;
			case 2:
				//凶のページへ飛ばす
				intent = new Intent(MainActivity.this , KyoActivity.class);
				startActivity(intent);
				break;
			case 3:
				//大凶のページへ飛ばす
				intent = new Intent(MainActivity.this , DaikyoActivity.class);
				startActivity(intent);
				break;
		}
	}



}
