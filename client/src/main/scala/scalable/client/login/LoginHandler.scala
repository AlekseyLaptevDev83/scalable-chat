/*
 * Copyright 2014 Eric Zoerner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package scalable.client.login

import akka.actor.{ ActorLogging, Actor }

import scalable.infrastructure.api.ResultStatus.ResultStatus

/**
 * Actor trait to handle client-side login events.
 *
 * @author Eric Zoerner <a href="mailto:eric.zoerner@gmail.com">eric.zoerner@gmail.com</a>
 */
trait LoginHandler {
  this: Actor with ActorLogging ⇒

  var listeners = Set[LoginListener]()

  def addListener(listener: LoginListener) = listeners = listeners + listener
  def removeListener(listener: LoginListener) = listeners = listeners - listener

  def handleLoginResult(resultStatus: ResultStatus, username: String) = {
    listeners.foreach(_.loginResult(resultStatus, username))
  }
}

trait LoginListener {
  def loginResult(resultStatus: ResultStatus, username: String): Unit
}
