package com.ts.docs.controller

import com.ts.docs.core.Main
import com.twitter.finagle.http.Status
import com.twitter.finatra.http.test.EmbeddedHttpServer
import com.twitter.inject.app.FeatureTest

class PingControllerTest extends FeatureTest {
   override val app = new EmbeddedHttpServer(new Main)

  "ping feature" should {

    "respond accordingly" in {
      app.httpGet(
        path = "/ping",
        andExpect = Status.Ok)
    }
  }
}
