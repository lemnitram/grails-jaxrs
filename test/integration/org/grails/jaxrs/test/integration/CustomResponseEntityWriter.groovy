/*
 * Copyright 2009 the original author or authors.
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
package org.grails.jaxrs.test.integration

import javax.ws.rs.Produces
import javax.ws.rs.core.MultivaluedMap
import javax.ws.rs.ext.Provider
import org.grails.jaxrs.support.MessageBodyWriterSupport
/**
 * @author Martin Krasser
 */
@Provider
@Produces('text/plain')
class CustomResponseEntityWriter extends MessageBodyWriterSupport<CustomResponseEntity> {

     void writeTo(CustomResponseEntity entity, MultivaluedMap httpHeaders, OutputStream entityStream) {
         entityStream << entity.content
     }

}
