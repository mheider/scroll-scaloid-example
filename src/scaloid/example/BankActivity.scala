package scaloid.example

import org.scaloid.common._

/**
 * Created by markus on 08.06.15.
 */
class BankActivity  extends SActivity{

  onCreate {

    contentView = new SVerticalLayout {
      STextView("neue view geladen")
    } padding 20.dip
  }


}
