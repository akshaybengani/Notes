# Module 2 Networking basics
*   A network a way to get things between two end points.
*   Protocols are used for doing networking. Protocols are sets of rules.
*   what do you want to do ? (application),where are you going? (Addressing), How do you get there ? (Media Types)
,Did you get there ? (Acknowledgements, error checking)
## Computer Networking models
Models, also called protocol stacks represented in layers help to understand where things go right or wrong.<br>
Models like 
* OSI layer 
* DOD 3 layer model 
* Simplified layel model
### Physical layer (Layer 1)
*   Cat 5 cables twisted pair copper wire
*   Fiber optic Coaxail cables
*   Cable model Plain phone (DSL) microwawes, wifi etc
### Data link layer (layer 2)
*   MAC address for the specific device
*   MAC address is a 12 digit 48 bit hexadecimal address that is unique
*   The first 6 digits are the vendor code and the other 6 digits are the individual interface code.
### Network Layer (Layer 3)
*   Where network packets are routed here you will see IP addresses and other protocols for resolving the IP addresses of the network or packet.
*   ARP(Address resolution Protocol) Turns an IP number into an ethernet number, very important, inseed of asking "Who is AKshay" you ask "Who is 192.268.232.11" and if you get a reply assiciate the ethernet address.
#### IP Addressing
*   IPv4 is a 32 bit address, containing 4 octets.
*   IPv6 is a 128 bit address.
#### DNS (Domain Name Server)
This is used to resolve the IP address and the webpage name stored on DNS servers.
### Transport layer (Layer 4)
*   The protocols of the layer provide host to host communication services for applications.
*   Uses in common and out-going ports to from a server
*   HTTP on port 80, HTTPS on port 443
*   TCP(Transmission Control Protocol) it is a connection oriented protocol and it sends an acknowledgement in period of time.
*   UDP(User Datagram Protocol) is connectionless. Used for media Streaming.
#### 3 way handshake
*   In this we basically check and send request to the web server and get the data activity after dinner for finishing.
### Session (Layer 5)
* Establishing and maintaining connections, Responsible for ports and ensures queries for service.
### Presentation (Layer 6)
* Ensures data is recieved in a usable format Data encryption is done here, browser architecture works here, preparation of DOM and layers are done in this layer.
### Application (layer 7)
*   This is where the applications talk to each other like email on SMTP File transfers FTP etc.
* Responsible for Determining when access to the network is required.

# Network Components
* Routers
* Switch 
* Bridge
* Proxy
* Load Balancers
* Wireless Access Points
* Firwall
* VPN Controllers
* NIDS / NIPS
* SIEM
* DLP
* NAC
* SSL/TLS
* Mail Media Gateway
* Hardware Security Modules

## Router
* Connects computer Networks
* Operate at layer 3
* A network have two connections which join two similar networks.
* Stores information about network destinations
* Outside connections of a LAN to a WAN
* Routers also provide firewall and security features.
### Networking Devices Router Security
* ACLs (Access Control Lists) Filtering packets by source address, destination address protocol, or port.
    * For example you can block certian set of IP addresses from network.
* Zones Segmenting networks based on functionality or security.
    * Routers can also connect inside the other routers in your internal network.
* Antispoofing Creating a set of access lists that deny access to private IP addresses and local host ranges from the internet.
## Switch
* Connects devices with a computer network by using packet swutching to recueve process and forward data to the destination device.
* Switch takes packet forwarding decisions are based on MAC addresses. It works both on layer 2 and layer 3 and offers connectivity via layer 1.
### Switch Security
* VLANs segment networks and limit braodcast traffic.
* Post Security Layer 2 feature.
    * Enable or disable individual switch ports based on MAC address.
    * Can take one of the following actions when detecting a violations of port security.
        *  Default Shudown Mode
        * Protect Mode
        * Restrict Mode
    *   Port Security is vulnerable to MAC address spoofing.
* Loop prevention
    *   When Data units can travel from a first LAN segment to a second LAN segment though more than one path looping happens.
    * In order to prevent looping STP Spanning tree Protocol is used as a link management protocol which keeps a record that provides path redundancy while preventing undersirable loops in the network
* Flood Guards: Detect and prevent malicious traffic normally associated with DoS Attacks.

## Bridge
*  Connect two different physical network using layer 2
* Replaced by switches
* Bridge loops like switch loops

## NAT (Network Address Translation)
* A method of remappping one IP address space into another by modifying network address information in the IP header of packets while they are in transit accross a traffic routing device.

## Proxy
* Boundary device between internal and external networks.
* Any device that acts on behalf of others provide security logging and caching.
* Proxy Server Bloack known malicious websites.
* Forward Proxy Retrieves data on behalf of a client.
* Reverse Proxy Protects access to a server on the internal network.
* Transperent proxy (aka interceoting inline or forced proxy) A caching server that redirects client request without modifying them to reduce bandwidth usage.

## Load Balancer
* Shifting burden from one device to another.
* Benifits
    * Reduces the response time,
    * Maximises throughput
    * Allows better allocation of resource.
*   Scheduling Distributing load
    * Round Robin taking turns using a circular patter.
    * Affinity Request send to a specific application
    * Least connections devices can be utilized
    * Random device selection.
*   Active/Active Servers work together
* Active/Passive All traffic is send to the active server.
* Virtual IPs (VIP) At least one physical server assigned but more than one virtual IP address assigned.

## Access Points
* Typically Wireless (WAP)
* Layer 2 the data link later of the OSI model
* Can operate as a bridge connecting a standard wired network to wireless devices or as a router passing data transmissions from one access point to another.
* Consist of a transmitter and reciever device used to create a wireless LAN.
* A centralized access control(AC) is capable of providing management.
### Access Controller types
* FAT 
    * These are also called as intelligent access point because they include all types of wireless access points and features like ACL, Quality of Service, VLAN support. 
    * They can be used as standand alone access controllers. 
    * They are costly because it requires powerfull hardware and complex software.
* FIT
    * These are scaled down version of FAT Access controllers for control and management function.
* Thin 
    * Access points are just Wireless transmitter and Reciever allowing to communicate over the wireless network.
    * They are cost effective and they donot require any complex hardware or software.
    * They works on Switch and they are also called as intelligent antenas, since they perform some extra work then an antena.
* Access Controllers can be Standalone based or controller based.
## Wireless Management and Security
* SSID (Service Set Identifier) These are basically the name of the wireless access points, they can be of two types
    * Broadcast It means the SSID is visible
    * Cloaked It means the SSID is hidden.
* MAC Filtering You can allow only sppecific device based on their MAC Address.
* Signal Strength You can set custom Strength of Signals to limit outside of your home or apartments.
* Band Selection It means you can configure the frequency channel on which you want to configure for your own personal use.
* Antenna Types and placements
    *  Omnidirectional They are not specific to a direction they are spreaded in all directions up, down,left, right etc
    *  Directional It means you can set to give network on a specific direction.

# Security Network Components and Measures
These are common and basic level security systems which most of the organizations use.
* Firewall
* NIDS NIPS
* VPN Controller
## Firewall
* A Firewall can be both hardware and software and can be very specific to any application on a system.
* The primary work of a Firewall is to allow and deny network traffic inside the internal network of the organization or a network.
* Firewall is a security device that monitors incoming and outgoing network traffic and decides wheather to allow of bloack specific traffic bbased on a defined set of security rules.
* A firewall can also be Network based or Host based.
* There are different types of firewalls
### Packet Filter Firewall
* It basically passes or blocks traffic to specific ports or IP addresses based on rules.
* Access Control List filter
* Little Intelligence Stateless
* Faster than Stateful inspection.
* Note they donot scans the content of a packet it just checks the header and decide wheather to get it inside or ignore.
* For example it may allow traffic on port 80 but blocks port for telnet connections as such it makes difficult to set each and every port and use for the firewall.

### Proxy Firewall
* Acts as a intermidiatory between your internal network and outside network.
* It decides the packet wheather to pass or ignore.
### Stateful Inspection Firewall
* These are intelligent firewalls which scans packets and then decides wheather to pass it in or out.
* They analyzes data flows and traffic patterns based on intelligence of how data flows.
* Dynamic access control decisions, because the network state is not static.
* Records and kept using a state table that tracks every communications channel including Tunnels and VPN.
* Remembers where the packet came from and where the next one should come from.
### Firewall Rules
* They can be configured for both inbound traffic and outbound traffic.
* Configured too specific computers, programs, Services, or ports or protocols.
* Order of firewall rules matters.
* Implicitly deny means by default everything is disabled and selected stuff is allowed.
### Application Firewall
* Controls input, output and or access from to or by an application or service bbased on categories rules or heuristics.
* Deep packet inspection is done for prevention of common web based attacks.
* Web application Firewall (WAF) protects web apps from injection Buffer overflows etc.
* Often included in other firewall types(Proxy,IDS/IPS)
## IDS / IPS
* Instrusion Detection System and Instrusion Prevention System these are the two systems which are responsible for checking and real time protection to systems and services.
* Intrusion any activity or action that attempts to undermine or compromise the confidentiality, integrity or availablity of resources.
* It acts like a burglur alarm which identify unauthorized activity, access or anomalies.
* Sensor : The IDS component that collects data from the data souces and passes it to analzer.
* Host based on individual Systems.
* Network based On the netwrork borders.

