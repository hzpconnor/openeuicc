package im.angry.openeuicc.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import im.angry.easyeuicc.R

/**
 * Minimal login screen shown at app start. No real authentication; tapping the button
 * continues to UnprivilegedMainActivity.
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            startActivity(Intent(this, UnprivilegedMainActivity::class.java))
            // Finish so back from main doesn't return to login
            finish()
        }
    }
}
