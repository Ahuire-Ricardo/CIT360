-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2019 a las 02:51:51
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `acme`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categories`
--

CREATE TABLE `categories` (
  `categoryId` int(10) UNSIGNED NOT NULL,
  `categoryName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Category classifications of inventory items';

--
-- Volcado de datos para la tabla `categories`
--

INSERT INTO `categories` (`categoryId`, `categoryName`) VALUES
(1, 'Cannon'),
(2, 'Explosive'),
(3, 'Misc'),
(4, 'Rocket'),
(5, 'Trap');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clients`
--

CREATE TABLE `clients` (
  `clientId` int(10) UNSIGNED NOT NULL,
  `clientFirstname` varchar(15) NOT NULL,
  `clientLastname` varchar(25) NOT NULL,
  `clientEmail` varchar(40) NOT NULL,
  `clientPassword` varchar(255) NOT NULL,
  `clientLevel` enum('1','2','3') NOT NULL DEFAULT '1',
  `comments` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clients`
--

INSERT INTO `clients` (`clientId`, `clientFirstname`, `clientLastname`, `clientEmail`, `clientPassword`, `clientLevel`, `comments`) VALUES
(4, 'Admin', 'User', 'admin@cit336.net', '$2y$10$lekGYH6OXkwzBQ.cP4qfdu49MrvTClQRjTVcXjmJib.9HAeCxKcIi', '3', ''),
(5, 'Ricardo', 'Ahuire', 'ricardoahuire@gmail.com', '$2y$10$qCXYwSoXi1CkMpdRWnGaZuJx.rkTWvsJFWTRZgAebvK9Snhfx2GdC', '1', ''),
(6, 'Aaron', 'Mondragon', 'amondragon@gmail.com', '$2y$10$pdggRE7UEgkpfBfkgmeWpOiGMuDRKcY5hP9wf.yy/M7ZD02vwdbr6', '1', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `images`
--

CREATE TABLE `images` (
  `imgId` int(10) UNSIGNED NOT NULL,
  `invId` int(10) UNSIGNED NOT NULL,
  `imgName` varchar(100) NOT NULL,
  `imgPath` varchar(150) NOT NULL,
  `imgDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `images`
--

INSERT INTO `images` (`imgId`, `invId`, `imgName`, `imgPath`, `imgDate`) VALUES
(1, 8, 'anvil.png', '/acme/images/products/anvil.png', '2018-03-20 16:23:40'),
(2, 8, 'anvil-tn.png', '/acme/images/products/anvil-tn.png', '2018-03-20 16:23:40'),
(3, 3, 'catapult.png', '/acme/images/products/catapult.png', '2018-03-20 16:50:24'),
(4, 3, 'catapult-tn.png', '/acme/images/products/catapult-tn.png', '2018-03-20 16:50:24'),
(5, 14, 'helmet.png', '/acme/images/products/helmet.png', '2018-03-20 16:51:25'),
(6, 14, 'helmet-tn.png', '/acme/images/products/helmet-tn.png', '2018-03-20 16:51:25'),
(7, 4, 'roadrunner.jpg', '/acme/images/products/roadrunner.jpg', '2018-03-20 16:52:47'),
(8, 4, 'roadrunner-tn.jpg', '/acme/images/products/roadrunner-tn.jpg', '2018-03-20 16:52:47'),
(9, 5, 'trap.jpg', '/acme/images/products/trap.jpg', '2018-03-20 16:53:48'),
(10, 5, 'trap-tn.jpg', '/acme/images/products/trap-tn.jpg', '2018-03-20 16:53:48'),
(11, 13, 'piano.jpg', '/acme/images/products/piano.jpg', '2018-03-20 16:54:31'),
(12, 13, 'piano-tn.jpg', '/acme/images/products/piano-tn.jpg', '2018-03-20 16:54:31'),
(13, 6, 'hole.png', '/acme/images/products/hole.png', '2018-03-20 16:55:05'),
(14, 6, 'hole-tn.png', '/acme/images/products/hole-tn.png', '2018-03-20 16:55:05'),
(15, 7, 'no-image.png', '/acme/images/products/no-image.png', '2018-03-20 16:56:36'),
(16, 7, 'no-image-tn.png', '/acme/images/products/no-image-tn.png', '2018-03-20 16:56:36'),
(17, 10, 'mallet.png', '/acme/images/products/mallet.png', '2018-03-20 16:57:11'),
(18, 10, 'mallet-tn.png', '/acme/images/products/mallet-tn.png', '2018-03-20 16:57:11'),
(19, 9, 'rubberband.jpg', '/acme/images/products/rubberband.jpg', '2018-03-20 16:57:43'),
(20, 9, 'rubberband-tn.jpg', '/acme/images/products/rubberband-tn.jpg', '2018-03-20 16:57:43'),
(21, 2, 'mortar.jpg', '/acme/images/products/mortar.jpg', '2018-03-20 16:58:27'),
(22, 2, 'mortar-tn.jpg', '/acme/images/products/mortar-tn.jpg', '2018-03-20 16:58:27'),
(23, 15, 'rope.jpg', '/acme/images/products/rope.jpg', '2018-03-20 16:59:13'),
(24, 15, 'rope-tn.jpg', '/acme/images/products/rope-tn.jpg', '2018-03-20 16:59:13'),
(29, 17, 'bomb.png', '/acme/images/products/bomb.png', '2018-03-20 17:01:01'),
(30, 17, 'bomb-tn.png', '/acme/images/products/bomb-tn.png', '2018-03-20 17:01:01'),
(31, 16, 'fence.png', '/acme/images/products/fence.png', '2018-03-20 17:01:37'),
(32, 16, 'fence-tn.png', '/acme/images/products/fence-tn.png', '2018-03-20 17:01:37'),
(33, 11, 'tnt.png', '/acme/images/products/tnt.png', '2018-03-20 17:01:56'),
(34, 11, 'tnt-tn.png', '/acme/images/products/tnt-tn.png', '2018-03-20 17:01:56'),
(35, 12, 'seed.jpg', '/acme/images/products/seed.jpg', '2018-03-20 17:14:23'),
(36, 12, 'seed-tn.jpg', '/acme/images/products/seed-tn.jpg', '2018-03-20 17:14:23'),
(37, 1, 'rocket.png', '/acme/images/products/rocket.png', '2018-03-20 17:18:46'),
(38, 1, 'rocket-tn.png', '/acme/images/products/rocket-tn.png', '2018-03-20 17:18:46'),
(39, 1, 'rocket01.jpg', '/acme/images/products/rocket01.jpg', '2018-03-20 19:39:36'),
(40, 1, 'rocket01-tn.jpg', '/acme/images/products/rocket01-tn.jpg', '2018-03-20 19:39:36'),
(41, 1, 'rocket02.jpg', '/acme/images/products/rocket02.jpg', '2018-03-20 19:40:02'),
(42, 1, 'rocket02-tn.jpg', '/acme/images/products/rocket02-tn.jpg', '2018-03-20 19:40:02'),
(43, 8, 'ProductxImage01.jpeg', '/acme/images/products/ProductxImage01.jpeg', '2018-03-20 20:02:13'),
(44, 8, 'ProductxImage01-tn.jpeg', '/acme/images/products/ProductxImage01-tn.jpeg', '2018-03-20 20:02:13'),
(45, 8, 'ProductxImage02.jpg', '/acme/images/products/ProductxImage02.jpg', '2018-03-20 20:02:46'),
(46, 8, 'ProductxImage02-tn.jpg', '/acme/images/products/ProductxImage02-tn.jpg', '2018-03-20 20:02:46');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventory`
--

CREATE TABLE `inventory` (
  `invId` int(10) UNSIGNED NOT NULL,
  `invName` varchar(50) NOT NULL DEFAULT '',
  `invDescription` text NOT NULL,
  `invImage` varchar(50) NOT NULL DEFAULT '',
  `invThumbnail` varchar(50) NOT NULL DEFAULT '',
  `invPrice` decimal(10,2) NOT NULL DEFAULT '0.00',
  `invStock` smallint(6) NOT NULL DEFAULT '0',
  `invSize` smallint(6) NOT NULL DEFAULT '0',
  `invWeight` smallint(6) NOT NULL DEFAULT '0',
  `invLocation` varchar(35) NOT NULL DEFAULT '',
  `categoryId` int(10) UNSIGNED NOT NULL,
  `invVendor` varchar(20) NOT NULL DEFAULT '',
  `invStyle` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Acme Inc. Inventory Table';

--
-- Volcado de datos para la tabla `inventory`
--

INSERT INTO `inventory` (`invId`, `invName`, `invDescription`, `invImage`, `invThumbnail`, `invPrice`, `invStock`, `invSize`, `invWeight`, `invLocation`, `categoryId`, `invVendor`, `invStyle`) VALUES
(1, 'Rocket', 'Rocket for multiple purposes. This can be launched independently to deliver a payload or strapped on to help get you to where you want to be FAST!!! Really Fast!', '/acme/images/products/rocket.png', '/acme/images/products/rocket-tn.png', '1320.00', 5, 60, 90, 'California', 4, 'Goddard', 'metal'),
(2, 'Mortar', 'Our Mortar is very powerful. This cannon can launch a projectile or bomb 3 miles. Made of solid steel and mounted on cement or metal stands [not included].', '/acme/images/products/mortar.jpg', '/acme/images/products/mortar-tn.jpg', '1500.00', 26, 250, 750, 'San Jose', 1, 'Smith & Wesson', 'Metal'),
(3, 'Catapult', 'Our best wooden catapult. Ideal for hurling objects for up to 1000 yards. Payloads of up to 300 lbs.', '/acme/images/products/catapult.png', '/acme/images/products/catapult-tn.png', '2500.00', 4, 1569, 400, 'Cedar Point, IO', 1, 'Wooden Creations', 'Wood'),
(4, 'Female RoadRunner Cutout', 'This carbon fiber backed cutout of a female roadrunner is sure to catch the eye of any male roadrunner.', '/acme/images/products/roadrunner.jpg', '/acme/images/products/roadrunner-tn.jpg', '20.00', 500, 27, 2, 'San Jose', 5, 'Picture Perfect', 'Carbon Fiber'),
(5, 'Giant Mouse Trap', 'Our big mouse trap. This trap is multifunctional. It can be used to catch dogs, mountain lions, road runners or even muskrats. Must be staked for larger varmints [stakes not included] and baited with approptiate bait [sold seperately].\r\n', '/acme/images/products/trap.jpg', '/acme/images/products/trap-tn.jpg', '20.00', 34, 470, 28, 'Cedar Point, IO', 5, 'Rodent Control', 'Wood'),
(6, 'Instant Hole', 'Instant hole - Wonderful for creating the appearance of openings.', '/acme/images/products/hole.png', '/acme/images/products/hole-tn.png', '25.00', 269, 24, 2, 'San Jose', 3, 'Hidden Valley', 'Ether'),
(7, 'Koenigsegg CCX', 'This high performance car is sure to get you where you are going fast. It holds the production car land speed record at an amazing 250mph.', '/acme/images/products/no-image.png', '/acme/images/products/no-image.png', '500000.00', 1, 25000, 3000, 'San Jose', 3, 'Koenigsegg', 'Metal'),
(8, 'Anvil', '50 lb. Anvil - perfect for any task requireing lots of weight. Made of solid, tempered steel.', '/acme/images/products/anvil.png', '/acme/images/products/anvil-tn.png', '150.00', 15, 80, 50, 'San Jose', 5, 'Steel Made', 'Metal'),
(9, 'Monster Rubber Band', 'These are not tiny rubber bands. These are MONSTERS! These bands can stop a train locamotive or be used as a slingshot for cows. Only the best materials are used!', '/acme/images/products/rubberband.jpg', '/acme/images/products/rubberband-tn.jpg', '4.00', 4589, 75, 1, 'Cedar Point, IO', 3, 'Rubbermaid', 'Rubber'),
(10, 'Mallet', 'Ten pound mallet for bonking roadrunners on the head. Can also be used for bunny rabbits.', '/acme/images/products/mallet.png', '/acme/images/products/mallet-tn.png', '25.00', 100, 36, 10, 'Cedar Point, IA', 3, 'Wooden Creations', 'Wood'),
(11, 'TNT', 'The biggest bang for your buck with our nitro-based TNT. Price is per stick.', '/acme/images/products/tnt.png', '/acme/images/products/tnt-tn.png', '10.00', 1000, 25, 2, 'San Jose', 2, 'Nobel Enterprises', 'Plastic'),
(12, 'Roadrunner Custom Bird Seed Mix', 'Our best varmint seed mix - varmints on two or four legs can\'t resist this mix. Contains meat, nuts, cereals and our own special ingredient. Guaranteed to bring them in. Can be used with our monster trap.', '/acme/images/products/seed.jpg', '/acme/images/products/seed-tn.jpg', '8.00', 150, 24, 3, 'San Jose', 5, 'Acme', 'Plastic'),
(13, 'Grand Piano', 'This grand piano is guaranteed to play well and smash anything beneath it if dropped from a height.', '/acme/images/products/piano.jpg', '/acme/images/products/piano-tn.jpg', '3500.00', 36, 500, 1200, 'Cedar Point, IA', 3, 'Wulitzer', 'Wood'),
(14, 'Crash Helmet', 'This carbon fiber and plastic helmet is the ultimate in protection for your head. comes in assorted colors.', '/acme/images/products/helmet.png', '/acme/images/products/helmet-tn.png', '100.00', 25, 48, 9, 'San Jose', 3, 'Suzuki', 'Carbon Fiber'),
(15, 'Nylon Rope', 'This nylon rope is ideal for all uses. Each rope is the highest quality nylon and comes in 100 foot lengths.', '/acme/images/products/rope.jpg', '/acme/images/products/rope-tn.jpg', '15.00', 200, 200, 6, 'San Jose', 3, 'Marina Sales', 'Nylon'),
(16, 'Sticky Fence', 'This fence is covered with Gorilla Glue and is guaranteed to stick to anything that touches it and is sure to hold it tight.', '/acme/images/products/fence.png', '/acme/images/products/fence-tn.png', '75.00', 15, 48, 2, 'San Jose', 3, 'Acme', 'Nylon'),
(17, 'Small Bomb', 'Bomb with a fuse - A little old fashioned, but highly effective. This bomb has the ability to devistate anything within 30 feet.', '/acme/images/products/bomb.png', '/acme/images/products/bomb-tn.png', '275.00', 58, 30, 12, 'San Jose', 2, 'Nobel Enterprises', 'Metal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reviews`
--

CREATE TABLE `reviews` (
  `reviewId` int(10) UNSIGNED NOT NULL,
  `reviewText` text NOT NULL,
  `reviewDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `invId` int(10) UNSIGNED NOT NULL,
  `clientId` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reviews`
--

INSERT INTO `reviews` (`reviewId`, `reviewText`, `reviewDate`, `invId`, `clientId`) VALUES
(1, 'Great product!', '2018-04-02 15:25:03', 10, 6),
(2, 'Excelent Quality!', '2018-04-02 20:05:57', 10, 6);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`categoryId`);

--
-- Indices de la tabla `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`clientId`);

--
-- Indices de la tabla `images`
--
ALTER TABLE `images`
  ADD PRIMARY KEY (`imgId`),
  ADD KEY `FK_inv_image` (`invId`);

--
-- Indices de la tabla `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`invId`),
  ADD KEY `categoryId` (`categoryId`);

--
-- Indices de la tabla `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`reviewId`),
  ADD KEY `FK_reviews_clients` (`clientId`),
  ADD KEY `FK_reviews_inventory` (`invId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categories`
--
ALTER TABLE `categories`
  MODIFY `categoryId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `clients`
--
ALTER TABLE `clients`
  MODIFY `clientId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `images`
--
ALTER TABLE `images`
  MODIFY `imgId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT de la tabla `inventory`
--
ALTER TABLE `inventory`
  MODIFY `invId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `reviews`
--
ALTER TABLE `reviews`
  MODIFY `reviewId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `images`
--
ALTER TABLE `images`
  ADD CONSTRAINT `FK_inv_image` FOREIGN KEY (`invId`) REFERENCES `inventory` (`invId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reviews`
--
ALTER TABLE `reviews`
  ADD CONSTRAINT `FK_reviews_clients` FOREIGN KEY (`clientId`) REFERENCES `clients` (`clientId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_reviews_inventory` FOREIGN KEY (`invId`) REFERENCES `inventory` (`invId`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
