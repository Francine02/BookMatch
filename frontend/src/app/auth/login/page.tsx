"use client";

import { useState } from "react";
import Button from "@/src/components/auth/Button";
import Img from "@/src/components/auth/Img";
import Input from "@/src/components/auth/Input";
import SocialAccount from "@/src/components/auth/SocialAccount";
import Link from 'next/link';

export default function Login() {
  const [formData, setFormData] = useState({
    email: '',
    password: ''
  })

  const [isLoading, setIsLoading] = useState(false);

  const handleChange = (field: string, value: string) => {
    setFormData({ ...formData, [field]: value });
  }

  const handleLogin = async () => {
    setIsLoading(true);

    // Simulação de requisição, arrumar depois
    await new Promise((resolve) => setTimeout(resolve, 2000));

    setIsLoading(false);
  }

  return (
    <div className='sm:grid sm:grid-cols-[2fr_3fr] md:grid-cols-[2fr_3fr] xl:grid-cols-[2fr_1fr] h-screen sm:items-center overflow-x-hidden'>
      <Img animate="animate-slideToRight" />

      <div className="px-10 md:px-16 lg:px-24 xl:px-8 2xl:px-24 py-8 justify-items-center bg-white animate-slideToLeft">
        <h1 className="text-3xl lg:text-4xl font-semibold tracking-wide text-center mb-10">Entrar</h1>

        <form onSubmit={(e) => { e.preventDefault(); handleLogin(); }}>
          <Input
            type='email'
            label="Seu email"
            placeholder="exemplo@gmail.com"
            value={formData.email}
            onChange={(e) => handleChange('email', e.target.value)} />

          <Input
            type='password'
            label="Sua senha"
            placeholder="senha123"
            value={formData.password}
            onChange={(e) => handleChange('password', e.target.value)} />

          <p className="text-sm pt-[-5px]">Não tem uma conta?
            <Link href="/auth/register">
              <span className="font-black cursor-pointer hover:opacity-80"> Crie uma.</span>
            </Link>
          </p>

          <Button isLoading={isLoading} text="Entrar" />
        </form>
        
        <SocialAccount />
      </div>
    </div>
  )
}
