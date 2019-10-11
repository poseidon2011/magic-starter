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

package com.xkcoding.magic.message.model.dingtalk;

import com.xkcoding.magic.message.enums.DingTalkType;
import com.xkcoding.magic.message.model.Message;
import lombok.Data;

/**
 * <p>
 * 钉钉消息，参考文档：https://open-doc.dingtalk.com/microapp/serverapi2/qf2nxq
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/11 13:48
 */
@Data
public abstract class AbstractDingTalkMessage implements Message {
	/**
	 * 钉钉消息类型
	 */
	private String msgtype;

	AbstractDingTalkMessage(DingTalkType dingTalkType) {
		this.msgtype = dingTalkType.getType();
	}
}
