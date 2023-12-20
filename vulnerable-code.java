public function checkConnection(Request $request) {
       $targetHostname = $request->input('host');
       $output = shell_exec("/bin/ping -c 3 $targetHostname");
       return ['output' => $output];
    }
