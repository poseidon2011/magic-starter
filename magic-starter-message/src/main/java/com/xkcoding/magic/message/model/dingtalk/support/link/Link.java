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

package com.xkcoding.magic.message.model.dingtalk.support.link;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * link 类型
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/11 13:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Link extends BaseLink {
	/**
	 * 消息内容。如果太长只会部分展示
	 */
	private String text;
	/**
	 * 点击消息跳转的URL
	 */
	private String messageUrl;
	/**
	 * 图片URL
	 */
	private String picUrl;

	public Link(String title, String text, String messageUrl, String picUrl) {
		super(title);
		this.text = text;
		this.messageUrl = messageUrl;
		this.picUrl = picUrl;
	}
}
