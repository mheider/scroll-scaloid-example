package scaloid.example

import org.scaloid.common._
import android.graphics.Color

class HelloScaloid extends SActivity {

  onCreate {
    info("HelloScaloid on Create running")
    contentView = new SVerticalLayout {

      this += new SLinearLayout() {
        STextView("change view: ")
        SButton("now").onClick(changeToTestActivity())
      }.wrap

    } padding 20.dip
  }

  def changeToTestActivity():Unit = {
    info("changeToTest called")
    var intent = SIntent[BankActivity]
    startActivity(intent);
    info("should have changed")
  }

}
