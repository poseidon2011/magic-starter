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
import com.xkcoding.magic.message.model.dingtalk.support.feedcard.FeedCard;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 钉钉 FeedCard 类型，参考文档：https://open-doc.dingtalk.com/microapp/serverapi2/qf2nxq#a-nameidq3rhafeedcard%E7%B1%BB%E5%9E%8B
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/11 14:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FeedCardDingTalkMessage extends AbstractDingTalkMessage {
	/**
	 * 消息内容
	 */
	private FeedCard feedCard;

	/**
	 * 消息类型，此时固定为：feedCard
	 */
	public FeedCardDingTalkMessage() {
		super(DingTalkType.FEEDCARD);
	}

}
