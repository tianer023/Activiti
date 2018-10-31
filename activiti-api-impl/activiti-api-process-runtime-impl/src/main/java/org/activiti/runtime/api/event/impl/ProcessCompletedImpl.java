/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.runtime.api.event.impl;

import org.activiti.api.process.runtime.events.ProcessCompletedEvent;
import org.activiti.api.process.model.events.ProcessRuntimeEvent;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.runtime.event.impl.RuntimeEventImpl;

public class ProcessCompletedImpl extends RuntimeEventImpl<ProcessInstance, ProcessRuntimeEvent.ProcessEvents>
        implements ProcessCompletedEvent {

    public ProcessCompletedImpl(ProcessInstance entity) {
        super(entity);
    }

    @Override
    public ProcessEvents getEventType() {
        return ProcessEvents.PROCESS_COMPLETED;
    }
}
