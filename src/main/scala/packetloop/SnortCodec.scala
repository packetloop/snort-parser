package packetloop

object SnortCodec {

  // Snort Rule - http://manual.snort.org/node28.html
  //   Most Snort rules are written in a single line, rules may span multiple lines by adding a backslash \ to the end of the line
  //   Snort rules are divided into two logical sections, the rule header and the rule options

  /**
   * @note http://manual.snort.org/node29.html
   */
  case class RuleHeader()

  /**
   * Rule Options
   * - All Snort rule options are separated from each other using the semicolon (;) character
   * - Rule option keywords are separated from their arguments with a colon (:) character
   *
   * @note http://manual.snort.org/node30.html
   */
  case class RuleOptions()

  // There are four major categories of rule options:
  //   general : provide information about the rule but do not have any affect during detection
  //   payload : all look for data inside the packet payload and can be inter-related
  //   non-payload : look for non-payload data
  //   post-detection : are rule specific triggers that happen after a rule has "fired"

  // General Rule Options - http://manual.snort.org/node31.html
  //   Reference
  //     The reference keyword allows rules to include references to external attack identification systems
  //     The plugin currently supports several specific systems as well as unique URLs
  //     This plugin is to be used by output plugins to provide a link to additional information about the alert produced

  // Supported Systems
  //
  //   bugtraq    http://www.securityfocus.com/bid/
  //   cve        http://cve.mitre.org/cgi-bin/cvename.cgi?name=
  //   nessus     http://cgi.nessus.org/plugins/dump.php3?id=
  //   arachnids  http://www.whitehats.com/info/IDS
  //   mcafee     http://vil.nai.com/vil/content/v_
  //   osvdb      http://osvdb.org/show/osvdb/
  //   msb        http://technet.microsoft.com/en-us/security/bulletin/
  //   url        http://

  // Format
  // reference:<id system>, <id>; [reference:<id system>, <id>;]

  // Examples
  //
  //  alert tcp any any -> any 7070 (msg:"IDS411/dos-realaudio"; \
  //  flags:AP; content:"|fff4 fffd 06|"; reference:arachnids,IDS411;)
  //
  //  alert tcp any any -> any 21 (msg:"IDS287/ftp-wuftp260-venglin-linux"; \
  //  flags:AP; content:"|31c031db 31c9b046 cd80 31c031db|"; \
  //  reference:arachnids,IDS287; reference:bugtraq,1387; \
  //  reference:cve,CAN-2000-1574;)


  // Reference - http://www.pearsonhighered.com/samplechapter/0131407333.pdf
  // The reference.config file plays an important role because it contains the actual URL to reach a particular reference

}
