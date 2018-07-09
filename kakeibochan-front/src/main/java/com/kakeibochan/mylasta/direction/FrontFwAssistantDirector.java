/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kakeibochan.mylasta.direction;

import java.util.List;

import javax.annotation.Resource;

import com.kakeibochan.mylasta.direction.sponsor.FrontApiFailureHook;
import com.kakeibochan.mylasta.direction.sponsor.FrontListedClassificationProvider;
import com.kakeibochan.mylasta.direction.sponsor.FrontMultipartRequestHandler;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.api.ApiFailureHook;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.ruts.multipart.MultipartResourceProvider;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;

/**
 * @author jflute
 */
public class FrontFwAssistantDirector extends KakeibochanFwAssistantDirector {

    @Resource
    private FrontConfig config;

    @Override
    protected void setupAppConfig(List<String> nameList) {
        nameList.add("front_config.properties"); // base point
        nameList.add("front_env.properties");
    }

    @Override
    protected void setupAppMessage(List<String> nameList) {
        nameList.add("front_message"); // base point
        nameList.add("front_label");
    }

    @Override
    protected ListedClassificationProvider createListedClassificationProvider() {
        return new FrontListedClassificationProvider();
    }

    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        super.prepareWebDirection(direction);
        direction.directHtmlRendering(createHtmlRenderingProvider());
        direction.directMultipart(createMultipartResourceProvider());
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere());
    }

    protected MultipartResourceProvider createMultipartResourceProvider() {
        return () -> new FrontMultipartRequestHandler();
    }

    @Override
    protected ApiFailureHook createApiFailureHook() {
        return new FrontApiFailureHook();
    }
}
