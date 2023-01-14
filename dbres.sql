-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : dim. 15 jan. 2023 à 00:43
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `dbres`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `id` int(11) NOT NULL,
  `code` varchar(25) NOT NULL,
  `libelle` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`id`, `code`, `libelle`) VALUES
(1, 'Cat12022', 'Simple'),
(2, 'Cat22022', 'Double Deluxe'),
(3, 'Cat32020', 'Double Economique'),
(4, 'Cat2022', 'Double Classique'),
(5, 'Cat2022', 'Simple Classique'),
(6, 'Cat62022', 'Double Confort'),
(7, 'Cat72020', 'Triple Economique'),
(8, 'Cat82022', 'Familiale'),
(9, 'Cat92022', 'lits Jumeaux Classique'),
(11, 'Cat92022', 'lits Jumeaux Classique');

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE `chambre` (
  `id` int(11) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `id_Catégorie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `chambre`
--

INSERT INTO `chambre` (`id`, `telephone`, `id_Catégorie`) VALUES
(1, '0660113109', 8),
(2, '0667239085', 1),
(3, '0721345190', 3),
(4, '0689968903', 6),
(5, '0721345194', 3),
(7, '0524265200', 8),
(8, '0721345192', 3),
(9, '0721345191', 3);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `telephone`, `email`) VALUES
(1, 'yassine Dbih', '06666666661', 'Dbih@gmail.com'),
(3, 'LaghribiYassine', '06666666663', 'LaghribiYassine@gmail.com'),
(4, 'AlouiajiSoukaina', '0666666662', 'AlouiajiSoukaina@gmail.co'),
(5, 'Alaoui3Modi', '0666666663Modi', 'alaouiali3@gmail.comModif'),
(6, 'Alaouia', '0666666660', 'alaouiali4Mod@gmail.com'),
(7, 'EttaniZakaria', '0666666665', 'EttaniZakaria@gmail.com'),
(8, 'RachikOussama', '0666666666', 'RachikOussama@gmail.com'),
(10, 'Alaoui2  ', '06666666662', 'alaoui@gmail.com'),
(11, 'Alaoui3', '06666666663', 'alaoui@gmail.com'),
(13, 'Alaoui3', '0666666663', 'alaouiali3@gmail.com'),
(14, 'ali', '066666666999', 'alaouiali4@gmail.com'),
(15, 'Alaoui5', '0666666665', 'alaouiali5@gmail.com'),
(16, 'Alaoui6', '0666666666', 'alaouiali6@gmail.com'),
(17, 'ali', '65456', 'testcon@interface'),
(18, 'kenza', '06446', 'kenza@fbl'),
(19, 'yassine', '0645789', 'yassine@fhkz'),
(20, 'ahmed', '0678523', 'ah@gamai;s'),
(21, 'Timmi', '218-334-9302', 'tfforde0@rambler.ru'),
(22, 'Valina', '245-998-1242', 'vkopje1@twitter.com'),
(23, 'Vito', '470-919-8960', 'vkroll2@macromedia.com'),
(24, 'Morena', '278-854-4808', 'mhilary3@issuu.com'),
(25, 'Rodge', '241-269-5780', 'rrelfe4@statcounter.com'),
(26, 'Nanni', '467-952-0465', 'nwike5@deliciousdays.com'),
(27, 'yassine', '0666', 'elamma'),
(28, 'LaghribiYssine', '06666666663', 'Laghribi@gmail.com'),
(29, 'Alaouia', '0666666660', 'alaouiali4Mod@gmail.com'),
(30, 'yassine44', '06666666661', 'Dbih@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `dateDebut` date NOT NULL,
  `dateFin` date NOT NULL,
  `id_chambre` int(11) NOT NULL,
  `id_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`id`, `dateDebut`, `dateFin`, `id_chambre`, `id_client`) VALUES
(2, '2022-10-02', '2022-11-01', 3, 1),
(3, '2022-12-02', '2022-12-03', 3, 6),
(4, '2022-12-01', '2022-12-02', 2, 5),
(5, '2022-12-15', '2022-12-08', 5, 1),
(6, '2022-12-03', '2022-12-03', 1, 1),
(7, '2022-10-05', '2022-11-06', 5, 6),
(8, '2022-10-30', '2022-11-20', 4, 4),
(9, '2022-12-01', '2022-12-15', 3, 5),
(10, '2022-10-02', '2022-11-01', 1, 1),
(11, '2022-02-02', '2022-02-01', 1, 1),
(12, '2022-02-02', '2022-02-01', 1, 1),
(13, '2022-02-02', '2022-02-01', 1, 1),
(14, '2022-02-02', '2022-02-01', 1, 1),
(15, '2022-02-02', '2022-02-01', 1, 1),
(16, '2022-02-02', '2022-02-01', 1, 1),
(17, '2022-02-02', '2022-02-01', 1, 1),
(18, '2022-02-02', '2022-02-01', 1, 1),
(19, '2022-10-05', '2022-11-17', 5, 6),
(20, '2022-10-05', '2022-11-17', 1, 6),
(21, '2022-10-05', '2022-11-17', 1, 6),
(22, '2022-02-02', '2022-02-01', 1, 1),
(23, '2022-02-02', '2022-02-01', 1, 1),
(24, '2022-02-02', '2022-02-01', 1, 1),
(27, '2022-02-02', '2022-02-01', 1, 8),
(28, '2022-02-02', '2022-02-01', 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `cin` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `username`, `cin`, `password`) VALUES
(1, 'maryem', 'ee866126', '6277');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`id`),
  ADD KEY `foreign_keyCate` (`id_Catégorie`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `foreign_keyClient` (`id_client`),
  ADD KEY `foreign_keyChambre` (`id_chambre`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `chambre`
--
ALTER TABLE `chambre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD CONSTRAINT `foreign_keyCate` FOREIGN KEY (`id_Catégorie`) REFERENCES `categorie` (`id`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `foreign_keyChambre` FOREIGN KEY (`id_chambre`) REFERENCES `chambre` (`id`),
  ADD CONSTRAINT `foreign_keyClient` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
