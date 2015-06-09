package scaloid.example

import org.scaloid.common._

/**
 * Created by markus on 08.06.15.
 */
class BankActivity  extends SActivity{

  onCreate {

    contentView = new SVerticalLayout {
      STextView("Penis")
    } padding 20.dip
  }


}
