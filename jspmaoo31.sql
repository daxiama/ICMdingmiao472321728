/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : jspmaoo31

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 09/05/2023 17:59:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chongzhixinxi
-- ----------------------------
DROP TABLE IF EXISTS `chongzhixinxi`;
CREATE TABLE `chongzhixinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `jine` int(11) DEFAULT NULL COMMENT '金额',
  `chongzhishijian` datetime(0) DEFAULT NULL COMMENT '充值时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683541314888 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '充值信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongzhixinxi
-- ----------------------------
INSERT INTO `chongzhixinxi` VALUES (1680951325196, '2023-04-08 18:55:25', '用户账号1', '用户姓名1', '13823888881', 96, '2023-04-08 18:55:18');
INSERT INTO `chongzhixinxi` VALUES (1680952313780, '2023-04-08 19:11:53', '用户账号1', '用户姓名1', '13823888881', 100, '2023-04-08 19:11:49');
INSERT INTO `chongzhixinxi` VALUES (1680952322821, '2023-04-08 19:12:02', '用户账号2', '用户姓名2', '13823888882', 100, '2023-04-08 19:11:59');
INSERT INTO `chongzhixinxi` VALUES (1680952793305, '2023-04-08 19:19:52', '用户账号1', '用户姓名1', '13823888881', 100, '2023-04-08 19:19:49');
INSERT INTO `chongzhixinxi` VALUES (1681967587870, '2023-04-20 13:13:07', '用户账号6', '用户姓名6', '13823888886', 93, '2023-04-20 13:13:04');
INSERT INTO `chongzhixinxi` VALUES (1682057398944, '2023-04-21 14:09:58', '001', '张三', '13523523235', 29, '2023-04-21 14:09:54');

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'upload/picture1.jpg');
INSERT INTO `config` VALUES (2, 'picture2', 'upload/picture2.jpg');
INSERT INTO `config` VALUES (3, 'picture3', 'upload/picture3.jpg');

-- ----------------------------
-- Table structure for diannaoxinxi
-- ----------------------------
DROP TABLE IF EXISTS `diannaoxinxi`;
CREATE TABLE `diannaoxinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '机号',
  `danjia` int(11) DEFAULT NULL COMMENT '单价',
  `diannaoxiangqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '电脑详情',
  `zhuangtai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1647929196857 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电脑信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of diannaoxinxi
-- ----------------------------
INSERT INTO `diannaoxinxi` VALUES (91, '2023-04-01 14:03:25', '电竞区4', 7, '<p>电脑详情1</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (92, '2023-04-01 14:03:25', '电竞区3', 7, '<p>电脑详情2</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (93, '2023-04-01 14:03:25', '电竞区2', 7, '<p>电脑详情3</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (94, '2023-04-01 14:03:25', '电竞区1', 7, '<p>电脑详情4</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (95, '2023-04-01 14:03:25', '普通区3', 5, '<p>电脑详情5</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (96, '2023-04-01 14:03:25', '普通区2', 5, '<p>电脑详情6</p>', '空');
INSERT INTO `diannaoxinxi` VALUES (1647929196856, '2023-04-01 14:03:25', '普通区1', 5, '<p>阿上档发送到发送到发送到发<img src=\"http://localhost:8080/jspmaoo31/upload/1681993365030.jpg\" width=\"900\" height=\"560\"/></p>', '空');

-- ----------------------------
-- Table structure for shangjixinxi
-- ----------------------------
DROP TABLE IF EXISTS `shangjixinxi`;
CREATE TABLE `shangjixinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `shangjishijian` datetime(0) DEFAULT NULL COMMENT '上机时间',
  `zhuangtai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
  `jihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机号',
  `danjia` int(11) DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683553449897 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '上机信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangjixinxi
-- ----------------------------
INSERT INTO `shangjixinxi` VALUES (1682057718758, '2023-04-21 14:15:17', '001', '张三', '13523523235', '2023-04-21 14:15:11', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1682057886278, '2023-04-21 14:18:05', '001', '张三', '13523523235', '2023-04-21 14:18:01', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1682077177598, '2023-04-21 19:39:37', '001', '张三', '13523523235', '2023-04-21 19:39:30', '已下机', '电竞区4', 7);
INSERT INTO `shangjixinxi` VALUES (1682599568791, '2023-04-27 20:46:08', '001', '张三', '13523523235', '2023-04-27 20:46:04', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1683118527461, '2023-05-03 20:55:26', '001', '张三', '13523523235', '2023-05-03 20:55:22', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1683517420533, '2023-05-08 11:43:40', '001', '张三', '13523523235', '2023-05-08 11:43:20', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1683518366452, '2023-05-08 11:59:26', '001', '张三', '13523523235', '2023-05-08 11:59:22', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1683518380865, '2023-05-08 11:59:39', '用户账号6', '用户姓名6', '13823888886', '2023-05-08 11:59:31', '已下机', '普通区1', 5);
INSERT INTO `shangjixinxi` VALUES (1683553449896, '2023-05-08 21:44:09', '001', '张三', '13523523235', '2023-05-08 21:44:06', '上机', '普通区1', 5);

-- ----------------------------
-- Table structure for shangpindingdan
-- ----------------------------
DROP TABLE IF EXISTS `shangpindingdan`;
CREATE TABLE `shangpindingdan`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单号',
  `shangpinmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `guige` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '规格',
  `jiage` float DEFAULT NULL COMMENT '价格',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `jine` float DEFAULT NULL COMMENT '金额',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `dingdanhao`(`dingdanhao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683613798057 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangpindingdan
-- ----------------------------
INSERT INTO `shangpindingdan` VALUES (1682057813189, '2023-04-21 14:16:53', '1682057802', '速食小火锅', '规格6', 20, 1, 20, '001', '张三', '是', '');
INSERT INTO `shangpindingdan` VALUES (1682601167505, '2023-04-27 21:12:47', '1682601158', '红烧牛肉面', '规格4', 5, 2, 10, '001', '张三', '是', '');
INSERT INTO `shangpindingdan` VALUES (1683517306126, '2023-05-08 11:41:45', '1683517296', '百岁山', '规格2', 2, 1, 2, '001', '张三', '是', '');
INSERT INTO `shangpindingdan` VALUES (1683533167966, '2023-05-08 16:06:07', '1683533163', '百岁山', '规格2', 2, 1, 2, '001', '张三', '是', '');
INSERT INTO `shangpindingdan` VALUES (1683613798056, '2023-05-09 14:29:57', '1683613732', '薯片', '200g/袋', 10, 1, 10, '001', '张三', '否', NULL);

-- ----------------------------
-- Table structure for shangpinxiaofeijilu
-- ----------------------------
DROP TABLE IF EXISTS `shangpinxiaofeijilu`;
CREATE TABLE `shangpinxiaofeijilu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单号',
  `shangpinmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `guige` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '规格',
  `jiage` float DEFAULT NULL COMMENT '价格',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `jine` float DEFAULT NULL COMMENT '金额',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683533225846 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品消费记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangpinxiaofeijilu
-- ----------------------------
INSERT INTO `shangpinxiaofeijilu` VALUES (1682057848987, '2023-04-21 14:17:28', '1682057802', '速食小火锅', '规格6', 20, 1, 20, '001', '张三');
INSERT INTO `shangpinxiaofeijilu` VALUES (1682601203430, '2023-04-27 21:13:23', '1682601158', '红烧牛肉面', '规格4', 5, 2, 10, '001', '张三');
INSERT INTO `shangpinxiaofeijilu` VALUES (1683517349365, '2023-05-08 11:42:29', '1683517296', '百岁山', '规格2', 2, 1, 2, '001', '张三');
INSERT INTO `shangpinxiaofeijilu` VALUES (1683533225845, '2023-05-08 16:07:04', '1683533163', '百岁山', '规格2', 2, 1, 2, '001', '张三');

-- ----------------------------
-- Table structure for shangpinxinxi
-- ----------------------------
DROP TABLE IF EXISTS `shangpinxinxi`;
CREATE TABLE `shangpinxinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `guige` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '规格',
  `shangpinjianshu` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '商品简述',
  `jiage` float DEFAULT NULL COMMENT '价格',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1681967115977 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangpinxinxi
-- ----------------------------
INSERT INTO `shangpinxinxi` VALUES (31, '2023-04-01 14:03:25', '薯片', '200g/袋', '', 10, 49);
INSERT INTO `shangpinxinxi` VALUES (32, '2023-04-01 14:03:25', '果汁', '规格2', '', 2, 48);
INSERT INTO `shangpinxinxi` VALUES (33, '2023-04-01 14:03:25', '槟榔', '规格3', '', 3, 100);
INSERT INTO `shangpinxinxi` VALUES (34, '2023-04-01 14:03:25', '红烧牛肉面', '规格4', '', 5, 98);
INSERT INTO `shangpinxinxi` VALUES (35, '2023-04-01 14:03:25', '椰椰拿铁', '规格5', '', 15, 100);
INSERT INTO `shangpinxinxi` VALUES (36, '2023-04-01 14:03:25', '速食小火锅', '规格6', '', 20, 49);
INSERT INTO `shangpinxinxi` VALUES (1681967115976, '2023-04-20 13:05:15', '烤肠', '规格10', '', 3, 100);

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1, 'abo', 'users', '管理员', 'b0aazn00izz7p0plvtu6zky19nl549la', '2023-03-22 14:04:26', '2023-05-09 18:33:28');
INSERT INTO `token` VALUES (2, 1647929091935, '001', 'yonghu', '用户', '0rk7k10mgf4fvbpp1078uquv59bh0x3o', '2023-03-22 14:06:47', '2023-05-09 17:38:30');
INSERT INTO `token` VALUES (3, 11, '用户账号1', 'yonghu', '用户', 'p7q9h3361gk9a1fhox1r9hrgctujtryv', '2023-04-06 14:23:52', '2023-04-06 15:23:53');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', '001', '管理员', '2023-03-22 14:03:25');

-- ----------------------------
-- Table structure for xiajikoufeijilu
-- ----------------------------
DROP TABLE IF EXISTS `xiajikoufeijilu`;
CREATE TABLE `xiajikoufeijilu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiajibianhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '下机编号',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `shangjishijian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '上机时间',
  `jihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机号',
  `shijian` int(11) DEFAULT NULL COMMENT '时间',
  `danjia` int(11) DEFAULT NULL COMMENT '单价',
  `jine` float DEFAULT NULL COMMENT '金额',
  `tijiaoshijian` datetime(0) DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683518491855 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '下机扣费记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xiajikoufeijilu
-- ----------------------------
INSERT INTO `xiajikoufeijilu` VALUES (1682057751115, '2023-04-21 14:15:50', '1682057727', '001', '张三', '13523523235', '2023-04-21 14:15:11', '普通区1', 1, 5, 5, '2023-04-21 14:15:47');
INSERT INTO `xiajikoufeijilu` VALUES (1682057926838, '2023-04-21 14:18:46', '1682057892', '001', '张三', '13523523235', '2023-04-21 14:18:01', '普通区1', 1, 5, 5, '2023-04-21 14:18:40');
INSERT INTO `xiajikoufeijilu` VALUES (1682077208138, '2023-04-21 19:40:07', '1682077182', '001', '张三', '13523523235', '2023-04-21 19:39:30', '电竞区4', 1, 7, 7, '2023-04-21 19:40:04');
INSERT INTO `xiajikoufeijilu` VALUES (1682599596429, '2023-04-27 20:46:35', '1682599574', '001', '张三', '13523523235', '2023-04-27 20:46:04', '普通区1', 1, 5, 5, '2023-04-27 20:46:30');
INSERT INTO `xiajikoufeijilu` VALUES (1683118565805, '2023-05-03 20:56:05', '1683118532', '001', '张三', '13523523235', '2023-05-03 20:55:22', '普通区1', 1, 5, 5, '2023-05-03 20:56:01');
INSERT INTO `xiajikoufeijilu` VALUES (1683517451421, '2023-05-08 11:44:11', '1683517430', '001', '张三', '13523523235', '2023-05-08 11:43:20', '普通区1', 1, 5, 5, '2023-05-08 11:44:06');
INSERT INTO `xiajikoufeijilu` VALUES (1683518436689, '2023-05-08 12:00:36', '1683518394', '用户账号6', '用户姓名6', '13823888886', '2023-05-08 11:59:31', '普通区1', 1, 5, 5, '2023-05-08 12:00:30');
INSERT INTO `xiajikoufeijilu` VALUES (1683518491854, '2023-05-08 12:01:31', '1683518415', '001', '张三', '13523523235', '2023-05-08 11:59:22', '普通区1', 1, 5, 5, '2023-05-08 12:01:28');

-- ----------------------------
-- Table structure for xiajixinxi
-- ----------------------------
DROP TABLE IF EXISTS `xiajixinxi`;
CREATE TABLE `xiajixinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiajibianhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '下机编号',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户姓名',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `shangjishijian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '上机时间',
  `jihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机号',
  `xiajishijian` datetime(0) DEFAULT NULL COMMENT '下机时间',
  `shijian` int(11) DEFAULT NULL COMMENT '时间',
  `danjia` int(11) DEFAULT NULL COMMENT '单价',
  `jine` float DEFAULT NULL COMMENT '金额',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `xiajibianhao`(`xiajibianhao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683518419191 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '下机信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xiajixinxi
-- ----------------------------
INSERT INTO `xiajixinxi` VALUES (1682057737604, '2023-04-21 14:15:36', '1682057727', '001', '张三', '13523523235', '2023-04-21 14:15:11', '普通区1', '2023-04-21 14:15:26', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1682057897788, '2023-04-21 14:18:17', '1682057892', '001', '张三', '13523523235', '2023-04-21 14:18:01', '普通区1', '2023-04-21 14:18:11', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1682077188467, '2023-04-21 19:39:47', '1682077182', '001', '张三', '13523523235', '2023-04-21 19:39:30', '电竞区4', '2023-04-21 19:39:41', 1, 7, 7, '是', '');
INSERT INTO `xiajixinxi` VALUES (1682599579246, '2023-04-27 20:46:18', '1682599574', '001', '张三', '13523523235', '2023-04-27 20:46:04', '普通区1', '2023-04-27 20:46:14', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1683118538678, '2023-05-03 20:55:38', '1683118532', '001', '张三', '13523523235', '2023-05-03 20:55:22', '普通区1', '2023-05-03 20:55:31', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1683517436429, '2023-05-08 11:43:56', '1683517430', '001', '张三', '13523523235', '2023-05-08 11:43:20', '普通区1', '2023-05-08 11:43:50', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1683518400429, '2023-05-08 11:59:59', '1683518394', '用户账号6', '用户姓名6', '13823888886', '2023-05-08 11:59:31', '普通区1', '2023-05-08 11:59:53', 1, 5, 5, '是', '');
INSERT INTO `xiajixinxi` VALUES (1683518419190, '2023-05-08 12:00:18', '1683518415', '001', '张三', '13523523235', '2023-05-08 11:59:22', '普通区1', '2023-05-08 12:00:14', 1, 5, 5, '是', '');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `shenfenzheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1683559359091 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (11, '2023-04-01 14:03:25', '用户账号1', '用户姓名1', '123456', '13823888881', '男', '440300199101010001');
INSERT INTO `yonghu` VALUES (12, '2023-04-01 14:04:25', '用户账号2', '用户姓名2', '123456', '13823888882', '男', '440300199202020002');
INSERT INTO `yonghu` VALUES (13, '2023-04-01 14:05:25', '用户账号3', '用户姓名3', '123456', '13823888883', '男', '440300199303030003');
INSERT INTO `yonghu` VALUES (14, '2023-04-01 14:03:25', '用户账号4', '用户姓名4', '123456', '13823888884', '男', '440300199404040004');
INSERT INTO `yonghu` VALUES (15, '2023-04-01 14:03:25', '用户账号5', '用户姓名5', '123456', '13823888885', '男', '440300199505050005');
INSERT INTO `yonghu` VALUES (16, '2023-04-01 14:03:25', '用户账号6', '用户姓名6', '123456', '13823888886', '男', '440300199606060006');
INSERT INTO `yonghu` VALUES (1647929091935, '2023-04-01 14:03:25', '001', '张三', '001', '13523523235', '男', '441421111111111111');
INSERT INTO `yonghu` VALUES (1683559359090, '2023-05-08 23:22:39', '123', '丁', '123', '15225790755', '男', '412722222222222222');

SET FOREIGN_KEY_CHECKS = 1;
