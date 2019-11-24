/*
 * Copyright  (c) 2018 - 2019. The EoySky of Team.
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
package com.cn.jonny.love.marry.mobile.utils;

import com.cn.jonny.love.marry.mobile.exception.RRException;

import java.util.Map;

/**
 * 功能简述 〈处理post请求参数〉
 *
 * @author Jonny Chang
 * @version 2019/1/10
 * @since 1.0.0
 */
public class ParamUtils {

  public static Integer getType(Integer type, Map<String, Object> params) {
    if (type == null) {
      if (params.get("type") == null) {
        throw new RRException("type is null !!!");
      }
      if (params.get("type").toString() != null) {
        type = Integer.parseInt(params.get("type").toString());
      } else {
        throw new RRException("type is null !!!");
      }
    }
    return type;
  }
}
