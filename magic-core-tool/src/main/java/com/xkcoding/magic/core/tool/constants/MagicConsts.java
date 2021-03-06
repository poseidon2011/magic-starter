/*
 * Copyright (c) 2019-2029, xkcoding & Yangkai.Shen & 沈扬凯 (237497819@qq.com & xkcoding.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xkcoding.magic.core.tool.constants;

/**
 * <p>
 * Magic Starter 常量池
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/23 14:26
 */
public interface MagicConsts {
	/**
	 * 项目名称常量
	 */
	String MAGIC = "magic";
	/**
	 * 注解 @Secure AOP顺序
	 */
	int AOP_ORDER_SECURE = 0;

	/**
	 * 注解 @Log AOP顺序
	 */
	int AOP_ORDER_LOG = AOP_ORDER_SECURE + 1;

	/**
	 * web 请求 AOP 顺序
	 */
	int AOP_ORDER_REQUEST_LOG = AOP_ORDER_SECURE - 1;
}
