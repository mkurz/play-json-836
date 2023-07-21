import play.api.libs.json.Format
import play.api.libs.json.Json

case class JsonModel(rawString: String) extends AnyVal

object JsonModel {
  implicit val format: Format[JsonModel] = Json.valueFormat[JsonModel]
}

import play.api.libs.json.JsSuccess
import play.api.libs.json.Json
import play.api.libs.json.Reads

class Spec {

  case class Test(underlying: Option[JsonModel])

  object Test {
    implicit val reads: Reads[Test] = Json.reads[Test]
  }
}
