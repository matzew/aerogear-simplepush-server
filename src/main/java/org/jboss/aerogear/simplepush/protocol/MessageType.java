/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.simplepush.protocol;

/**
 * Represents the basis of a message in the 
 * <a href="https://wiki.mozilla.org/WebAPI/SimplePush/Protocol">SimplePush specification protocol</a>
 */
public interface MessageType {
    
    /**
     * The name of the JSON field that identifies a messageType according to the SimplePush protocol.
     */
    String MESSSAGE_TYPE_FIELD = "messageType";
    
    enum Type {HELLO, REGISTER, NOTIFICATION, UNREGISTER, ACK}
    
    /**
     * The value of the 'messageType' field of a JSON SimplePush Protocol message.
     * 
     * @return {@code String} 
     */
    Type getMessageType();
}
