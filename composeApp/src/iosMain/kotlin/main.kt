import androidx.compose.ui.window.ComposeUIViewController
import org.howtohelp.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
